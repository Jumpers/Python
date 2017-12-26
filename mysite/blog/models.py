from django.db import models
from django.utils import timezone
from django.contrib.auth.models import User
from django.core.urlresolvers import reverse


class PublishedManager(models.Manager):
	"""docstring for PublishedManager"""
	#新建一个数据查询类
	def get_queryset(self):
		return super(PublishedManager,self).get_queryset()\
			.filter(status='published')


#Create your models here.
class Post(models.Model):
	#设置选择项，用于下拉选择
	STATUS_CHOICES = (	('draft', 'Draft'),	('published', 'Published'),	)
	#设置标题
	title = models.CharField(max_length=250)
	#用于urls,常用字段为unique_for_date,同一个日期,不允许有两个相同的title
	slug = models.SlugField(max_length=250,	unique_for_date='publish')
	#作者
	author = models.ForeignKey(User,related_name='blog_posts')
	#正文
	body = models.TextField()
	#发布时间
	publish = models.DateTimeField(default=timezone.now)
	#创建时间
	created = models.DateTimeField(auto_now_add=True)
	#更新时间
	updated = models.DateTimeField(auto_now=True)
	#状态
	status = models.CharField(max_length=10,choices=STATUS_CHOICES,	default='draft')

	#创建数据模型
	"""docstring for Post"""
	objects=models.Manager() #The default manager.
	published = PublishedManager() #Our defined manager.

	#生成一个,入参为blog.post_detail
	def get_absolute_url(self):
		return reverse('blog:post_detail',\
			args=[self.publish.year,\
			self.publish.strftime('%m'),\
			self.publish.strftime('%d'),
			self.slug])

		

	class Meta:
		ordering = ('-publish',)


	def __str__(self):
		return self.title	
	
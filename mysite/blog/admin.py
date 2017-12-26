from django.contrib import admin
from .models import Post

# Register your models here.

#/*用于给admin添加模块*/
class PostAdmin(admin.ModelAdmin):
	#用于列出哪些在admin用户下展示
	list_display=('title', 'slug', 'author', 'publish','status')
	#用于过滤的条件
	list_filter = ('status', 'created', 'publish', 'author')
	#用于搜索的条件
	search_fields = ('title', 'body')
	#用于关联其它字段，进行自动填充
	prepopulated_fields = {'slug': ('title',)}
	#从源表中进行勾选
	raw_id_fields = ('author',)
	#按照publish字段进行分级
	date_hierarchy = 'publish'
	#按照status升序，按照publish进行降序
	ordering = ['status', '-publish']

#添加Post
admin.site.register(Post,PostAdmin)




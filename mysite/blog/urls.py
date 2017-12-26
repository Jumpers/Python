from django.conf.urls import url
from . import views

urlpatterns=[
#post views
url(r'^$',views.post_list,name='post_list'),#默认展示列表信息
#url(r'^$', views.PostListView.as_view(), name='post_list'),
#url请求中带有参数year,month,day,post,并且使用views中的post_detail方法接收
url(r'^(?P<year>\d{4})/(?P<month>\d{2})/(?P<day>\d{2})/'r'(?P<post>[-\w]+)/$',views.post_detail,name='post_detail'),

]
  # coding=gbk

import csv
class BrowserSpeedTest:
    
    def Speedtest(self,file,proxy,key_name):
        reader = csv.reader(open(name, 'rb'))
        temproxylist = []
        temp = []
        first = []
        second = []
        third = []
        flow = []
        flowspeed = []
        for i in reader:    #按行读取数据
            print i
            if proxy in i:
                temproxylist.append(i)  #挑选含有proxy字段的信息，添加进如新的tempspeedlist中。       
			# print temproxylist
			# print len(temproxylist)
       
        for i in range(0,len(temproxylist)):
            if key_name in temproxylist[i][10] and float(temproxylist[i][5])>0 and float(temproxylist[i][6])>0:       #判断是否包含特定字符串，并且是正确数据
                first.append(temproxylist[i][4])     #数组中添加首文字时间
                second.append(temproxylist[i][5])    #数组中添加页面铺满时间
                third.append(temproxylist[i][6])     #数组中添加全部加载完成时间      
                flow.append(temproxylist[i][8])      #添加流量
                flowspeed.append(temproxylist[i][9])  #添加传输时间
         # print first
         # print second
          # print third   
         # print flowspeed
        first = map(float,first) #将元素转换成float类型，以便于后续平均值的计算
        second = map(float,second)
        third = map(float,third)
        flow = map(float,flow)
        flowspeed = map(float,flowspeed)
          
        for i in first:
            if i > 0:
                temp.append(i)
        temp.sort()    #排序
         # print temp
        del temp[0:2] #去除小两个数值
         # print temp
        temp.reverse()
        del temp[0:2] #去除最大两个数值
         # print temp  
        try: 
            print '<-------- ' + proxy + ' -- ' +key_name + ' 首文字------->'
            print sum(temp)/len(temp)   
        except Exception:          
            print "无测试数据或者有效数据不足" 
        temp = []     #将临时变量清空
            
        for i in second:
            if i > 0:
                temp.append(i)
        temp.sort()    #排序
         # print temp
        del temp[0:2] #去除小两个数值
         # print temp
        temp.reverse()
        del temp[0:2] #去除最大两个数值
         # print temp  
        try: 
            print '<-------- ' + proxy + ' -- ' +key_name + ' 全屏铺满------->'
            print sum(temp)/len(temp)   
        except Exception:          
            print "无测试数据或者有效数据不足" 
        temp = []   
        
        for i in third:
            if i > 0:
                temp.append(i) 
        temp.sort()    #排序
         # print temp
        del temp[0:2] #去除小两个数值
         # print temp
        temp.reverse()
        del temp[0:2] #去除最大两个数值
         # print temp  
        try: 
            print '<-------- ' + proxy + ' -- ' +key_name + ' 全部加载------->'
            print sum(temp)/len(temp)   
        except Exception:          
            print "无测试数据或者有效数据不足"
        temp = []   
        
        for i in flow:
            if i > 100:  #流量大于100为判断标志还有待考证，因为基于csv文件数据操作，可以自定义修改判断条件
                temp.append(i)
        temp.sort()    #排序
         # print temp
        del temp[0:2] #去除小两个数值
         # print temp
        temp.reverse()
        del temp[0:2] #去除最大两个数值
         # print temp  
        try: 
            print '<-------- ' + proxy + ' -- ' +key_name + ' 流量大小------->'
            print sum(temp)/len(temp)   
        except Exception:          
            print "无测试数据或者有效数据不足"
        temp = []    
             
        for i in flowspeed:
            if i > 0:
                temp.append(i)
        temp.sort()    #排序
         # print temp
        del temp[0:2] #去除小两个数值
         # print temp
        temp.reverse()
        del temp[0:2] #去除最大两个数值
         # print temp  
        try: 
            print '<-------- ' + proxy + ' -- ' +key_name + ' 传输速度------->'
            print sum(temp)/len(temp) 
            print '\n'   
        except Exception:          
            print "无测试数据或者有效数据不足"
        temp = []   
                     
if __name__ == "__main__":
    name = "c:\\result.csv"
    bst = BrowserSpeedTest()
    bst.Speedtest(name,'proxy','qq_wh_wifi_m.sohu.com')
    #bst.Speedtest(name,'proxy','qq_wh_wifi_m.taobao.com')
    #bst.Speedtest(name,'proxy','qq_wh_wifi_www.56.com')
    bst.Speedtest(name,'direct','qq_wh_wifi_m.sohu.com')
    #bst.Speedtest(name,'direct','qq_wh_wifi_m.taobao.com')
    #bst.Speedtest(name,'direct','qq_wh_wifi_www.56.com')
    #bst.Speedtest(name,'direct','uc_wh_wifi_m.sohu.com')
    #bst.Speedtest(name,'direct','uc_wh_wifi_m.taobao.com')
    #bst.Speedtest(name,'direct','uc_wh_wifi_www.56.com')
    #bst.Speedtest(name,'proxy','uc_wh_wifi_www.56.com')
    #bst.Speedtest(name,'proxy','spdy_wh_wifi_m.sohu.com')
    #bst.Speedtest(name,'proxy','spdy_wh_wifi_m.taobao.com')
    #bst.Speedtest(name,'proxy','spdy_wh_wifi_www.56.com')
    #bst.Speedtest(name,'direct','spdy_wh_wifi_m.sohu.com')
    #bst.Speedtest(name,'direct','spdy_wh_wifi_m.taobao.com')
    #bst.Speedtest(name,'direct','spdy_wh_wifi_www.56.com')
    #bst.Speedtest(name,'direct','uc_dl_2g_m.sohu.com')
    #bst.Speedtest(name,'direct','uc_dl_2g_m.taobao.com')
    #bst.Speedtest(name,'direct','uc_dl_2g_m.youku.com')
    
    
    
    
    

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
        for i in reader:    #���ж�ȡ����
            print i
            if proxy in i:
                temproxylist.append(i)  #��ѡ����proxy�ֶε���Ϣ����ӽ����µ�tempspeedlist�С�       
			# print temproxylist
			# print len(temproxylist)
       
        for i in range(0,len(temproxylist)):
            if key_name in temproxylist[i][10] and float(temproxylist[i][5])>0 and float(temproxylist[i][6])>0:       #�ж��Ƿ�����ض��ַ�������������ȷ����
                first.append(temproxylist[i][4])     #���������������ʱ��
                second.append(temproxylist[i][5])    #���������ҳ������ʱ��
                third.append(temproxylist[i][6])     #���������ȫ���������ʱ��      
                flow.append(temproxylist[i][8])      #�������
                flowspeed.append(temproxylist[i][9])  #��Ӵ���ʱ��
         # print first
         # print second
          # print third   
         # print flowspeed
        first = map(float,first) #��Ԫ��ת����float���ͣ��Ա��ں���ƽ��ֵ�ļ���
        second = map(float,second)
        third = map(float,third)
        flow = map(float,flow)
        flowspeed = map(float,flowspeed)
          
        for i in first:
            if i > 0:
                temp.append(i)
        temp.sort()    #����
         # print temp
        del temp[0:2] #ȥ��С������ֵ
         # print temp
        temp.reverse()
        del temp[0:2] #ȥ�����������ֵ
         # print temp  
        try: 
            print '<-------- ' + proxy + ' -- ' +key_name + ' ������------->'
            print sum(temp)/len(temp)   
        except Exception:          
            print "�޲������ݻ�����Ч���ݲ���" 
        temp = []     #����ʱ�������
            
        for i in second:
            if i > 0:
                temp.append(i)
        temp.sort()    #����
         # print temp
        del temp[0:2] #ȥ��С������ֵ
         # print temp
        temp.reverse()
        del temp[0:2] #ȥ�����������ֵ
         # print temp  
        try: 
            print '<-------- ' + proxy + ' -- ' +key_name + ' ȫ������------->'
            print sum(temp)/len(temp)   
        except Exception:          
            print "�޲������ݻ�����Ч���ݲ���" 
        temp = []   
        
        for i in third:
            if i > 0:
                temp.append(i) 
        temp.sort()    #����
         # print temp
        del temp[0:2] #ȥ��С������ֵ
         # print temp
        temp.reverse()
        del temp[0:2] #ȥ�����������ֵ
         # print temp  
        try: 
            print '<-------- ' + proxy + ' -- ' +key_name + ' ȫ������------->'
            print sum(temp)/len(temp)   
        except Exception:          
            print "�޲������ݻ�����Ч���ݲ���"
        temp = []   
        
        for i in flow:
            if i > 100:  #��������100Ϊ�жϱ�־���д���֤����Ϊ����csv�ļ����ݲ����������Զ����޸��ж�����
                temp.append(i)
        temp.sort()    #����
         # print temp
        del temp[0:2] #ȥ��С������ֵ
         # print temp
        temp.reverse()
        del temp[0:2] #ȥ�����������ֵ
         # print temp  
        try: 
            print '<-------- ' + proxy + ' -- ' +key_name + ' ������С------->'
            print sum(temp)/len(temp)   
        except Exception:          
            print "�޲������ݻ�����Ч���ݲ���"
        temp = []    
             
        for i in flowspeed:
            if i > 0:
                temp.append(i)
        temp.sort()    #����
         # print temp
        del temp[0:2] #ȥ��С������ֵ
         # print temp
        temp.reverse()
        del temp[0:2] #ȥ�����������ֵ
         # print temp  
        try: 
            print '<-------- ' + proxy + ' -- ' +key_name + ' �����ٶ�------->'
            print sum(temp)/len(temp) 
            print '\n'   
        except Exception:          
            print "�޲������ݻ�����Ч���ݲ���"
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
    
    
    
    
    

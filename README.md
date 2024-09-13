# [首页查询更多项目](https://github.com/GraduationProject-ssm) 包安装运行


# 11144ssm新生入学报到管理系统

![picture](https://raw.githubusercontent.com/GraduationProject-springboot/.github/main/img/wx.png)

### 点击播放视频 ▼
[![Watch the video](https://i.sstatic.net/Vp2cE.png)](https://www.bilibili.com/video/BV1Kp48e9EtU?p=34)


# 系统概述
进过系统的分析后，就开始记性系统的设计，系统设计包含总体设计和详细设计。总体设计只是一个大体的设计，经过了总体设计，我们能够划分出系统的一些东西，例如文件、文档、数据等。而且我们通过总体设计，大致可以划分出了程序的模块，以及功能。但是只是一个初步的分类，并没有真正的实现。

整体设计，只是一个初步设计，而且，对于一个项目，我们可以进行多个整体设计，通过对比，包括性能的对比、成本的对比、效益的对比，来最终确定一个最优的设计方案，选择优秀的整体设计可以降低开发成本，增加公司效益，从这一点来讲，整体设计还是非常重要的。

新生入学信息管理系统工作原理图如图4-1所示：

![](/md/blog.012.png)

图4-1 系统工作原理图
## 4.2 系统结构设计
系统架构图属于系统设计阶段，系统架构图只是这个阶段一个产物，系统的总体架构决定了整个系统的模式，是系统的基础。新生入学信息管理系统的整体结构设计如图4-2所示。

![](/md/blog.013.png)

图4-2 系统结构图
## 4.3数据库设计
数据库是计算机信息系统的基础。目前，电脑系统的关键与核心部分就是数据库。数据库开发的优劣对整个系统的质量和速度有着直接影响。
### 4.3.1 数据库设计原则
数据库的概念结构设计采用实体—联系（E-R）模型设计方法。E-R模型法的组成元素有：实体、属性、联系，E-R模型用E-R图表示，是提示学生工作环境中所涉及的事物，属性则是对实体特性的描述。在系统设计当中数据库起着决定性的因素。下面设计出这几个关键实体的实体—关系图。
### 4.3.2 数据库实体
数据模型中的实体（Entity），也称为实例，对应现实世界中可区别于其他对象的“事件”或“事物”。例如，公司中的每个员工，家里中的每个家具。

本系统的E-R图如下图所示：

1、学生信息实体图如图4-3所示：

![](/md/blog.014.png)

图4-3学生信息实体图

2、报道指南实体图如图4-4所示：

![](/md/blog.015.png)

图4-4报道指南实体图

3、商品信息实体图如图4-5所示：

![](/md/blog.016.png)

图4-5商品信息实体图

#########

### 4.3.3 数据库表设计
数据库的表信息属于设计的一部分，下面介绍数据库中的各个表的详细信息。

表4-1 allusers表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|int|11|NOT NULL|
|username|varchar|50|` `default NULL|
|pwd|varchar|50|` `default NULL|
|cx|varchar|50|` `default NULL|


表4-2 baodaozhinan表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|int|11|NOT NULL|
|addtime|varchar|50|default NULL|
|biaotimingcheng|varchar|50|default NULL|
|tupian|varchar|50|default NULL|
|neirong|varchar|50|default NULL|
|faburiqi|varchar|50|default NULL|
|zhuyishixiang|varchar|50|default NULL|

表4-3：jiankangma表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|` `int|11|NOT NULL |
|addtime|varchar|50|default NULL|
|xuehao|varchar|50|default NULL|
|xueshengxingming|varchar|50|default NULL|
|xingbie|varchar|50|default NULL|
|zhuanye|varchar|50|default NULL|
|banji|varchar|50|default NULL|
|jiankangma|varchar|50|default NULL|
|gengxinriqi|varchar|50|default NULL|
|dakashijian|varchar|50|default NULL|
|`	`dangqianwendu|varchar|50|default NULL|
|shifoubushi|varchar|50|default NULL|
|shifoujiuyi|varchar|50|default NULL|
|qitaqingkuang|varchar|50|default NULL|


表4-4：shangpinxinxi表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|` `int|11|NOT NULL |
|addtime|varchar|50|default NULL|
|shangpinbianhao|varchar|50|default NULL|
|shangpinmingcheng|varchar|50|default NULL|
|fenlei|varchar|50|default NULL|
|tupian|varchar|50|default NULL|
|shangpinxiangqing|varchar|50|default NULL|
|clicktime|varchar|50|default NULL|
|clicknum|varchar|50|default NULL|

表4-5：xinshengqiandao表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|` `int|11|NOT NULL |
|addtime|varchar|50|default NULL|
|xuehao|varchar|50|default NULL|
|xueshengxingming|varchar|50|default NULL|
|zhuanye|varchar|50|default NULL|
|banji|varchar|50|default NULL|
|qiandaoshijian|varchar|50|default NULL|
|beizhu|varchar|50|default NULL|





# 5统详细设计
## 5.1前台首页功能模块
新生入学信息管理系统，在系统首页可以查看首页、报道指南、商品信息、论坛信息、公告信息、我的、跳转到后台、购物车等内容，如图5-1所示。

![](/md/blog.017.png)

图5-1前台首页功能界面图



`    `学生注册，在学生注册页面可以填写学号、密码、学生姓名、联系电话、邮箱等详细内容，如图5-2所示。

![](/md/blog.018.png)

图5-2学生注册界面图

登录，在登录页面通过填写账号、密码、类型等信息完成登录，如图5-3所示。报道指南页面通过填写发布日期、注意事项等信息进行点击收藏操作，如图5-4所示。

![](/md/blog.019.png)

图5-3登录界面图

![](/md/blog.020.png)

图5-4报道指南界面图

## 5.2管理员功能模块
管理员登录，通过填写注册时输入的用户名、密码进行登录，如图5-5所示。

![](/md/blog.021.png)

图5-5管理员登录界面图

管理员登录进入新生入学信息管理系统可以查看主页、个人中心、学生管理、专业管理、班级管理、新生签到管理、报道指南管理、健康码管理、商品分类管理、商品信息管理、论坛管理、系统管理、订单管理等信息。

个人中心，在个人中心页面中可以通过填写原密码、新密码、确认密码等内容进行个人中心添加，如图5-6所示。还可以根据需要对个人信息进行添加，修改等详细操作，如图5-7所示。

![](/md/blog.022.png)

图5-6个人中心界面图

![](/md/blog.023.png)

图5-7个人信息界面图

学生管理，在学生管理页面中可以查看学号、密码、学生姓名、性别、头像、专业、班级、联系电话、邮箱、余额等信息，并可根据需要对已有学生管理进行修改或删除等操作，如图5-8所示。

![](/md/blog.024.png)

图5-8学生管理界面图

专业管理，在专业管理页面中可以查看专业等信息，并可根据需要对已有专业管理进行修改或删除等详细操作，如图5-9所示。

![](/md/blog.025.png)

图5-9专业管理界面图

新生签到管理，在新生签到管理页面中可以查看学号、学生姓名、专业、班级、签到时间、备注等内容，并且根据需要对已有新生签到管理进行添加，修改或删除等详细操作，如图5-10所示。

![](/md/blog.026.png)

图5-10新生签到管理界面图

报道指南管理，在报道指南管理页面中可以查看标题名称、图片、内容、发表日期、注意事项等内容，并且根据需要对已有报道指南管理进行添加，修改或删除等详细操作，如图5-11所示。

![](/md/blog.027.png)

图5-11报道指南管理界面图

商品分类管理，在商品分类管理页面中可以查看分类等内容，并且根据需要对已有商品分类管理进行添加，修改或删除等详细操作，如图5-12所示。

![](/md/blog.028.png)

图5-12商品分类管理界面图

商品信息管理，在商品信息管理页面中可以查看商品编号、商品名称、分类、图片、商品详情、价格等内容，并且根据需要对已有商品信息管理进行添加，修改或删除等详细操作，如图5-13所示。

![](/md/blog.029.png)

图5-13商品信息管理界面图

公告信息管理，在公告信息管理页面中可以查看标题、图片、内容等内容，并且根据需要对已有公告信息管理进行添加，修改或删除等详细操作，如图5-14所示。

![](/md/blog.030.png)

图5-14公告信息管理界面图


轮播图；该页面为轮播图管理界面。管理员可以在此页面进行首页轮播图的管理，通过新建操作可在轮播图中加入新的图片，还可以对以上传的图片进行修改操作，以及图片的删除操作，如图5-15所示。

![](/md/blog.031.png)

图5-15轮播图管理界面图







## 5.3学生功能模块
学生登录进入新生入学信息管理系统可以查看主页、个人中心、新生签到管理、健康码管理、我的收藏管理、订单管理等内容。

新生签到管理，在新生签到管理页面中通过填写学号、学生姓名、专业、班级、签到日期、备注等信息，还可以根据需要对新生签到管理进行修改，如图5-16所示。

![](/md/blog.032.png)

图5-16新生签到管理界面图

健康码管理，在健康码管理页面中可以查看学号、学生姓名、性别、专业、班级、健康码等信息，并且根据需要对已有健康码管理进行查看删除等其他详细操作，如图5-17所示。

![](/md/blog.033.png)

图5-17健康码管理界面图

我的收藏管理，在我的收藏管理页面中通过填写用户ID、收藏ID、表名、收藏名称、收藏图片等内容进行我的收藏管理添加、收藏，如图5-18所示。

![](/md/blog.034.png)

图5-18我的收藏管理界面图












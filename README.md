参考AppJoint开源方案开发的一套简单易上手易维护的Android组件化开发框架


#### 接入方式：
###### 添加插件：
项目的根build文件中添加

 classpath 'com.github.dcendents:android-maven-gradle-plugin:2.1'
 classpath'com.github.runingWoniu.hello:plugin:1.1.0'

在app的build文件中添加插件

apply plugin: 'app-joint'

###### 添加aar包

在基础的conmon组件库中


api 'com.github.runingWoniu:codedesign:1.0.1'
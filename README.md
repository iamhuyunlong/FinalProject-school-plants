# 关于git和github的使用

1、首先是在github上，把代码从班级项目的repo，fork到自己个人的repo上。

## 2、获取班级仓库中的最新代码
第一次是用fork，以后想获取班级仓库中的最新代码可以用pull request。

到自己个人的repo下，点New pull request,修改base fork 和head fork，注意这时是从班级到个人，所以base fork选自己，head fork选班级。

之后可以在下面看到Able to merge，点Create pull request，在下面输入title后可以commit（注意如果没有看到Able to merge，表示有冲突，要解冲突才能继续）。

这时候再到自己repo下的pull request去merge（这时权限在你）。

成功后班级仓库和你个人的仓库就一样了。

## 3、把代码从github下载到自己的电脑上
第一次下载时在适当位置启动git，输入git clone 网址 。

网址获取方式：repo中右侧绿色的clone or download

以后每次下载可以用pull 命令。

由于clone下来时默认远程仓库就是github上，所以在本地相应文件夹下启动git，输入git pull 即可。

或者输入git pull origin master:master ，也可以有一样的效果。

## 4、把代码从本地上传到远程仓库
在本地的文件夹下启动git 

### 如果是通过clone获取的文件(已经存在仓库，且默认远程分支是github上的)：

输入git add .    (注意add后面有空格再加一个点)

git commit –m “xxx” (简单写明每次提交的注释，如add menu之类的)

git push origin master

### 如果是自己新的项目：

git init (新建仓库)

git add .

git commit -m "xxx "

git remote add origin 网址  (用来添加远程分支)

git push -u origin master

完成后就把最新的文件从本地传到github自己的远程仓库上了。

## 5、把代码从自己的repo提交到班级repo
和第二步相似，用pull request的方式，但这次merge的权限是在master这里

还是到自己个人的repo下，点New pull request,这时base fork选班级，head fork选自己，看到Able to merge，点Create pull request，注意把备注写详细，写明这次提交修改了哪方面的内容。

## 另外：
1、冲突原因：简单理解就是两者同时修改了同一个地方（比如你把原仓库pull下来后修改了readme，但同时master也修改了readme，当你想pull request时就会起冲突）。 

2、每个人在写代码之前，先去看下班级repo是否有新的commit。如果没有就是没有改过，就不用更新到自己repo。如果有更新就先pull request到自己的repo里，再git pull到自己本地，然后再写自己的代码，写完之后push，再pull request。这样应该不可能有冲突。

3、往班级提交代码有冲突时和我说，我来解冲突。自己要把班级repo同步下来时有冲突自己试着解，不行再和我说。在github上可以很清楚地看到冲突来源，这也是为什么我没有给大家直接push到班级仓库的权限，而用pull request的方式提交。

### 4、git在第一次使用前要初始化用户名和邮箱，不然后续很多都不能使用，具体命令如下：

git config --global user.name "你的用户名"

git config --global user.email "你的邮箱"

5、git每次在哪里打开目录就在哪里，如果要改用cd命令。

### 6、每一次的提交都必须要写备注(在title下的评论)，方便我查看代码和merge。

7、这里写的内容在实际操作过程中肯定还会有很多问题，大家可以百度，也可以直接在群上问。




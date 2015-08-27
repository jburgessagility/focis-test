# install.packages("xtable")
# install.packages("gridExtra")
# install.packages("ggplot2")
rm(list=ls())
library(xtable)
library("gridExtra")
library(ggplot2)
setwd(paste0("C:\\Users\\astuder\\Desktop\\attachi\\",format(Sys.time(), "%Y-%m-%d")))
# setwd(paste0("C:\\Users\\astuder\\Desktop\\attachi\\2015-08-26"))
temp = list.files(pattern="*.csv")
pdf()  
for(z in 1:length(temp)){
  

  burgess1<- read.csv( temp[z], header=FALSE, ";")
  names(burgess1) <- c("test","user","brow","vers","time")
  for(y in 1:nlevels(burgess1$vers)){
    burgess<-  burgess1[c(burgess1$vers==levels(burgess1$vers)[y]),]


# a=paste0("C:\\Users\\astuder\\Desktop\\attachi\\",format(Sys.time(), "%Y-%m-%d"))
# setwd(a[])

# Transpose table YOU WANT
# fooData.T <- t(fooData[,2:ncol(fooData)])
# Set the column headings
# colnames(fooData.T) <- fooData[1,]

# james <- read.table("temp", header=TRUE, ",")


# 
# temp = list.files(pattern="*.csv")
# setwd("")
# temp = list.files(pattern="*.csv")

# for (i in 1:length(temp)) assign(temp[i], read.csv(temp[i]))
  # burgess<- read.csv( temp[1], header=FALSE, ";")

a<-qplot(time, data=burgess, geom=c("density"),
      facets=test~., fill=test)
print(a,floating=FALSE)


# View(burgess)
# View(james)

# james<-t(james)
# View(james)

# attach(burgess)
# mean(subset("")time)
# [test=='Heavy Job Load',]
# ast=c(test=='Heavy Job Load',:)
# detach(newdata)


# x.sub <- subset(burgess, c(test='Heavy Job Load',time))
# View(x.sub)
# newdata <- burgess[c(burgess$test,burgess$time)]
# detach(burgess)

# for(int i :foo = seq(1,nlevels(burgess$test) , by=2)){
#   mean(subset(burgess, test == levels)$time)
# }
# mean(subset(burgess, test == "blank Job")$time)
 # = 3




# for (i in 1:nlevels(burgess$test)) {
#   print(c(levels(burgess$test)[i],
#           "mean", mean(subset(burgess, test == levels(burgess$test)[i])$time),
#           "median",median(subset(burgess, test == levels(burgess$test)[i])$time),
#           "min",min(subset(burgess, test == levels(burgess$test)[i])$time),
#           "max",max(subset(burgess, test == levels(burgess$test)[i])$time)))
# }



# 
# data(tli)
# > ## Demonstrate data.frame
# tli.table <- xtable(tli[1:10,])
# digits(tli.table)[c(2,6)] <- 0
# print(tli.table,floating=FALSE)
# 
# (tli[1:10,]
# )
# 
# 
# n = c(2, 3, 5) 
# s = c("aa", "bb", "cc") 
# b = c(TRUE, FALSE, TRUE) 
# df = data.frame(n, s, b)  

# 
# df <- data.frame(Doubles=double(),
#                  Ints=integer(),
#                  Factors=factor(),
#                  Logicals=logical(),
#                  Characters=character(),
#                  stringsAsFactors=FALSE)

# df <- data.frame(stringsAsFactors=FALSE,Ints=integer(),Ints=integer(),Ints=integer(),Ints=integer())


# df = data.frame(names(c("bla","MEAN","MEDIAN","MIN","MAX")))
# # View(df)
# names(df) <- c("bla","MEAN","MEDIAN","MIN","MAX")

# for (i in 1:nlevels(burgess$test)) {
#   n=c(
#             levels(burgess$test)[i],
#             mean(subset(burgess, test == levels(burgess$test)[i])$time),
#             median(subset(burgess, test == levels(burgess$test)[i])$time),
#             min(subset(burgess, test == levels(burgess$test)[i])$time),
#             max(subset(burgess, test == levels(burgess$test)[i])$time))
# }
# df = data.frame(n)
# names(data.frame) <- c("TEST","MEAN","MEDIAN","MIN","MAX")
# View(data.frame)

# 
# for (i in 1:10) {
#   df <- rbind(df, data.frame(x = i, y = toString(i)))
# }



df <- data.frame(stringsAsFactors=FALSE,Ints=integer(),Ints=integer(),Ints=integer(),Ints=integer(),Ints=integer())

for (i in 1:nlevels(burgess$test)){
  df <- rbind(df, data.frame(
    levels(burgess$test)[i],
    mean(subset(burgess, test == levels(burgess$test)[i])$time),
    median(subset(burgess, test == levels(burgess$test)[i])$time),
    min(subset(burgess, test == levels(burgess$test)[i])$time),
    max(subset(burgess, test == levels(burgess$test)[i])$time),
    sd(subset(burgess, test == levels(burgess$test)[i])$time)))
}

names(df) <- c("TEST","MEAN","MEDIAN","MIN","MAX","SD")
View(df)
tli.table <- xtable(df)
digits(tli.table)[c(2,6)] <- 0
print(tli.table,floating=FALSE)
# dev.copy(jpeg,filename=paste0("table",temp[z],".jpg"))
# dev.off ()

plot.new()
print(df,floating=FALSE)
grid.table(df)
#dev.copy(jpeg,filename=paste0("table",temp[z],".jpg"))
#dev.off ()


layout(matrix(c(1,2),nrow=1),
       width=c(3,2)) 
par(mar=c(5,4,4,0)) #Get rid of the margin on the right sid
stripchart(time ~ test, data = burgess,xaxt="n", ylab="n",
           vertical = TRUE, method = 'jitter', jitter = 0.2, cex = 1,
           pch = 16, col = rainbow(8))
boxplot(time~test,data=burgess,xaxt="n",add=TRUE,ylab="Loading Time")
title(main=paste0("USER: ",temp[z]), paste0(burgess$brow," ",burgess$vers), 
      xlab="Type of Test", ylab="Loading Time")
# axis(2, at=nlevels(burgess$test),labels=1:6, col.axis="red", las=2)
# axis(1, at=1:nlevels(burgess$test),labels=letters[1:nlevels(burgess$test)], col.axis="red", las=2)
ma <- matrix(1:nlevels(burgess$test), 1, nlevels(burgess$test))
axis(1, at=1:nlevels(burgess$test),labels=ma, las=1)
plot(c(0,2),type="n", axes=F, xlab="", ylab="")
legend("top", paste(1:nlevels(burgess$test),levels(burgess$test)))







# boxplot(time~test,data=burgess, main=paste0("USER: ",temp[1]), 
#         xlab="Type of Test", ylab="Loading Time",sub=paste0(burgess$brow," ",burgess$vers))
#dev.copy(jpeg,filename=paste0("boxplot",temp[z],".jpg"))
#dev.off ()

rm(burgess)
rm(df)
}}
dev.off() 











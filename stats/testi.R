library(ggplot2)
library(beeswarm)
rm(list=ls())
# data(singer, package="lattice")



setwd(paste0("C:\\Users\\astuder\\Desktop\\attachi\\",format(Sys.time(), "%Y-%m-%d")))
temp = list.files(pattern="*.csv")


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
  
  burgess<- read.csv( temp[1], header=FALSE, ";")
  names(burgess) <- c("test","user","brow","vers","time")
  qplot(time, data=burgess, geom=c("density"),
        facets=test~., fill=test)
  
  
  
  

  legend()
  
  
  
  
  # specify the data 
  x <- c(1:10)
  y <- x
  z <- 10/x
  
  # create extra margin room on the right for an axis 
  par(mar=c(5, 4, 4, 8) + 0.1)
  
  # plot x vs. y 
  plot(x, y,type="b", pch=21, col="red", 
       yaxt="n", lty=3, xlab="", ylab="")
  
  # add x vs. 1/x 
  lines(x, z, type="b", pch=22, col="blue", lty=2)
  
  # draw an axis on the left 
  axis(2, at=x,labels=x, col.axis="red", las=2)
  
  # draw an axis on the right, with smaller text and ticks 
  axis(4, at=z,labels=round(z,digits=2),
       col.axis="blue", las=2, cex.axis=0.7, tck=-.01)
  
  # add a title for the right axis 
  mtext("y=1/x", side=4, line=3, cex.lab=1,las=2, col="blue")
  
  # add a main title and bottom and left axis labels 
  title("An Example of Creative Axes", xlab="X values",
        ylab="Y=X")
  
  
  
  
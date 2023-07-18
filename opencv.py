import cv2 as cv
import numpy as np
img=cv.imread('C:/Users/Gites/OneDrive/Pictures/HP Palette Sample Photos/SamplePhoto_14.jpg')
cv.imshow('SamplePhoto_14.jpg',img)
gray=cv.cvtColor(img,cv.COLOR_BGR2GRAY)
cv.imshow('Gray',gray)
blur=cv.GaussianBlur(img, (7,7) ,cv.BORDER_DEFAULT)
cv.imshow('Blur',blur)
cany=cv.Canny(img,125,175)
cv.imshow('Canny Edges',cany)
dilated=cv.dilate(cany,(3,3),iterations=10)
cv.imshow('Dilated',dilated)
eroder=cv.erode(dilated,(3,3),iterations=1)
cv.imshow('eroder',eroder)
resized=cv.resize(img,(500,500))
cv.imshow('resized',resized)
cv.waitKey(0)


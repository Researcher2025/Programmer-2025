import cv2 as cv
import numpy as np
videocapture=cv.VideoCapture(0)
prevcircle=None
dist=lambda x1,y1,x2,y2:(x1-x2)**2+(y1-y2)**2
while True:
    ret,frame=videocapture.read()
    if not ret:break
    grayframe=cv.cvtColor(frame,cv.COLOR_BGR2GRAY)
    blurFrame=cv.GaussianBlur(grayframe,(17,17),0)
    circles=cv.HoughCircles(blurFrame,cv.HOUGH_GRADIENT,0.4,50,param1=80,param2=30,minRadius=45,maxRadius=100)

    if circles is not None:
        circles=np.uint(np.around(circles))
        chosen=None
        for i in circles[0,:]:
            if chosen is None: chosen=i
            if prevcircle is not None:
                if dist(chosen[0],chosen[1],prevcircle[0],prevcircle[1])<=dist(i[0],i[1],prevcircle[0],prevcircle[1]):
                    chosen=i
        cv.circle(frame,(chosen[0],chosen[1]),1,(0,100,100),3)
        cv.circle(frame,(chosen[0],chosen[1]),chosen[2],(255,0,255),3)
        prevcircle=chosen
    cv.imshow("circles",frame)
    if cv.waitKey(1) & 0xFF==ord('q'):break
videocapture.release()
cv.destroyAllWindows()


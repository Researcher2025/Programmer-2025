#include<graphics.h>
#include<conio.h>
class bounceball
{
	public:
		void bounce();
};

void bounceball::bounce()
{
	int gd,gm,i,x,y;
	gd=DETECT;
	initgraph(&gd,&gm,NULL);
	getmaxx();
	getmaxy();
	for(i=0;i<=300;i++)
	{
		setcolor(YELLOW);
		line(0,310,600,310);
		circle(i,i,10);
		delay(10);
		cleardevice();
	}
	for(i=300;i>=0;i--)
	{
		setcolor(RED);
		line(0,310,600,310);
		x++;
		circle(300+x,i,10);
		delay(10);
		cleardevice();
	}
	
	for(y=0;y<=200;y=y+1)
	{
		line(0,450,300,450);
		setcolor(YELLOW);
		circle(100,200+y,35);
		delay(10);
		if(y>=200)
		{
			for(y=200;y>=100;y=y-1)
			{
				line(0,450,500,450);
				setcolor(BLUE);
				circle(100,200+y,35);
				delay(30);
				cleardevice();
				for(y=200;y>=100;y=y-1)
				{
					line(0,450,500,450);
					setcolor(YELLOW);
					circle(100,200+y,35);
					circle(100,200-y,80);
					circle(250+x,200-y,30);
					delay(40);
					cleardevice();
				}
			}
		}
		cleardevice();
	}
	getch();
	closegraph();
}

int main()
{
	bounceball b1;
	b1.bounce();
	return 0;
}

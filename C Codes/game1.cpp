#include<stdio.h>
#include<conio.h>
#include<windows.h>
void gotoxy(int col,int row)
{
	HANDLE hStdout=GetStdHandle(STD_OUTPUT_HANDLE);
	COORD position={col,row};
	SetConsoleCursorPosition(hStdout,position);
};
int main()
{
		int r,c;
	for(c=30;c<=42;c++)
	{
		for(r=8;r<=16;r+=2)
		{
			gotoxy(c,r);
			printf("%c",196);
		}
	}
	for(r=8;r<=16;r++)
	{
		for(c=30;c<=42;c+=3)
		{
			gotoxy(c,r);
			printf("%c",179);
		}
	}
	for(c=33;c<=39;c+=3)
	{
		gotoxy(c,8);
		printf("%c",194);
		gotoxy(c,16);
		printf("%c",193);
	}
	for(r=10;r<=14;r+=2)
	{
		gotoxy(30,r);
		printf("%c",195);
		gotoxy(42,r);
		printf("%c",180);
	}
	for(r=10;r<=14;r+=2)
	{
		for(c=33;c<=39;c+=3)
		{
			gotoxy(c,r);
			printf("%c",197);
		}
	}
	gotoxy(30,8);
			printf("%c",218);
			gotoxy(42,8);
			printf("%c",191);
			gotoxy(30,16);
			printf("%c",192);
			gotoxy(42,16);
			printf("%c",217);

getch();
}

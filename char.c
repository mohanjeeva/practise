#include<stdio.h>
#define  MAX_SIZE 100
int main()
{
char string[MAX_SIZE];
int alphabets,digits,others,i;
alphabets=digits=others=i=0;
printf("Enter any string:");
gets(string);
while(strng[i]!='\0')
{
if((string[i]>='a' && string[i]<='z')||(string[i]>='A' && string[i]<='Z'))
{
alphabets++;
}
else if(string[i]>='0' && string[i]<='9')
{
digit++;
}
else
{
others++;
}
i++;
}
printf("Alphabets =%d\n",alphabets);
printf("Digits=%d\n",digits);
printf("Special charecters=%d\n",others);
return 0;
}


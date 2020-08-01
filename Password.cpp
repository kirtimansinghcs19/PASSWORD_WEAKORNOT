/*Write a program that takes in a string as input and evaluates it as a valid password. The password is valid if it has at a minimum 2 numbers, 2 of the following special characters ('!', '@', '#', '$', '%', '&', '*'), and a length of at least 7 characters.
If the password passes the check, output 'Strong', else output 'Weak'.
*/

#include <iostream>
using namespace std;

int main() {
int i,l=0,n=0,ch=0;
char psd[100];
cin>>psd;
for(i=0;psd[i]!='\0';i++)
l++;
if(l>=6)
{
    for(i=0;psd[i]!='\0';i++)
    {
        if(psd[i]>=48&&psd[i]<=57)
        n++;
                if(psd[i]=='!'||psd[i]=='@'||psd[i]=='#'||psd[i]=='$'||psd[i]=='%'||psd[i]=='&'||psd[i]=='*')
        ch++;
    }
    if(n>1&&ch>1)
    cout<<"Strong";
    else
    cout<<"Weak";
}
else
cout<<"Weak";
    return 0;
}

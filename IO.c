#include <stdio.h>
#include <stdlib.h>

#define MAX 50
char * s_gets(char * st,int n);

int main(void)
{
    char use[MAX];
    s_gets(use,MAX);
    puts(use);
}
char * s_gets(char * st,int n)
{
    char * ret;
    int i = 0;

    ret = fgets(st,n,stdin);
    if(ret)
    {
        while(st[i] != '\n' && st[i] != '\0')
            i++;
        if(st[i] == '\n')
        {
            st[i] = '\0';
        }
        else
        {   
           
            while(getchar() != '\n')
                continue;
        }
    }
    return ret;
}


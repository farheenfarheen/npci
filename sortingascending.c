#include<stdio.h>
int main()
{
        int n,temp=0,a[10];
        //intailizing size of array
        scanf("%d",&n);
        //intaializing array
        for(int i=0;i<n;i++)
        {
                scanf("%d",&a[i]);
        }
        for(int i=0;i<n;i++)
        {
                for(int j=i+1;j<n;j++)
                {
                        if(a[i]>a[j])
                        {
                                temp=a[i];
                                a[i]=a[j];
                                a[j]=temp;
                        }
                }
        }
        //printing sorting elements
        for(int i=0;i<n;i++)
        {
                printf("%d",a[i]);
        }
}


#include <stdio.h>

int main() {
    int h, m;
    scanf("%d %d", &h, &m);
    if(m>=45)
    printf("%d %d",h,m-45);
    else if(h>0){
	m-=45;
    printf("%d %d",h-1,m+60);
}
else{

m-=45;
    printf("%d %d",24-1,m+60);}
	
}
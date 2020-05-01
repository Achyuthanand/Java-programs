#include<iostream>
using namespace std;
struct complex{
int a,b;
  
};
int main(){
  int n,i,i1;
  complex one,two;
cin>>n>>one.a>>one.b>>two.a>>two.b;
  switch(n){
    case 1:
      i=one.a+two.a;
      i1=one.b+two.b;
       if(i1<0)
      cout<<i<<i1<<"i";
      else
        cout<<i<<"+"<<i1<<"i";
      break;
      
      break;
    case 2:
       i=one.a-two.a;
      i1=one.b-two.b;
       if(i1<0)
      cout<<i<<i1<<"i";
      else
        cout<<i<<"+"<<i1<<"i";
      break;
      
      break;
    case 3:
      i=(one.a*two.a)-(one.b*two.b);
      i1=(one.a*two.b)+(two.a*one.b);
      
      if(i1<0)
      cout<<i<<i1<<"i";
      else
        cout<<i<<"+"<<i1<<"i";
      break;
      
    default:
      cout<<"Invalid choice";
      break;
  }
  
}
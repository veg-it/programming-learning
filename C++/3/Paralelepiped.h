#include<iostream>
#include <math.h>

using namespace std;

class Paralelepiped:Shape {
   protected:
    int a, b, h;
  public:
    Paralelepiped(){
      cout<<"Input a: ";
      cin>>a;
      cout<<"Input b: ";
      cin>>b;
      cout<<"Input height: ";
      cin>>h;
    }
    virtual double get_v(){return a*b*h;};
    virtual double get_s(){return 2*(a*b+b*h+h*a);};
};
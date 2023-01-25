#include<iostream>
#include <math.h>

using namespace std;

class Tetraed:public Shape {
  protected:
    int a;
  public:
    Tetraed(){
      cout<<"Input a: ";
      cin>>a;
    }
    virtual double get_v(){return (sqrt(2)/12)*a*a*a;};
    virtual double get_s(){return sqrt(3)*a*a;};
    
};
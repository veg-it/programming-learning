#include<iostream>
#include <math.h>

using namespace std;

class Cube: public Shape{
  protected:
    int a;
  public:
    Cube(){
      cout<<"Input a: ";
      cin>>a;
    }
    virtual double get_v(){return a*a*a;};
    virtual double get_s(){return 6*a*a;};
};
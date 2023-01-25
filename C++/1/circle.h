#include<iostream>
#include <math.h>

using namespace std;
class circle {          
  protected:
    int x,y;
    double r;
  public:
    circle(void) {
      cout<<"Input x: ";
      cin>>x;
      cout<<"Input y: ";
      cin>>y;
      cout<<"Input r: ";
      cin>>r;
    }
    circle(const circle &copy){
      x = copy.x;
      y = copy.y;
      r = copy.r/2;
    }

    void get_x() {
      cout<<"x: "<<x<<endl;
    }
    void get_y() {
      cout<<"y: "<<y<<endl;
    }
    void get_r() {
      cout<<"r: "<<r<<endl;
    }
    void get_length() {
      cout<<"Length: "<<M_PI * 2 * r<<endl;
    }
};
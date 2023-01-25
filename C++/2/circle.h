#include <cstdlib>
#include <iostream>
#include <math.h>
using namespace std;

class circle {
protected:
  double r;

public:
  circle() {
    cout << "Enter a radius of square: ";
    cin >> r;
  }
  int area() { return M_PI * r * r; };
};
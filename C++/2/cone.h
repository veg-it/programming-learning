#include <cstdlib>
#include <iostream>
#include <math.h>
using namespace std;

class cone : public circle {
  double h;

public:
  cone() {
    cout << "Enter a height of cone: ";
    cin >> h;
  }
  int area() {
    int l = sqrt(r * r + h * h);
    return M_PI * r * l;
  }
};
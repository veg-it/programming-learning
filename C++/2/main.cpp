#include <cstdlib>
#include <iostream>
#include <math.h>
#include "circle.h"
#include "cone.h"
using namespace std;

int main() {
  cout<<"Єгоров Євгеній ІР21. Рівень А"<<endl<<endl<<"Короткі відомості про программу"<<endl;
  cout<<"circle - при створенні конструктор запитує радіус кола, фунцкія area повертае значення"<<endl;
  cout<<"cone - при створенні наслідує класс circle, потім конструктор запитує висоту конуса, фунцкія area повертае значення"<<endl;
  cout<<endl<<"Create new circle: "<<endl;
  circle *s1 = new circle;
  cout<<"Circle area: "<<s1->area()<<endl;
  cout<<endl<<"Create new cone:"<<endl;
  cone *t1 = new cone;
  cout<<"Circle area: "<<t1->area();

  return 0;
}
#include <iostream>
#include <math.h>
#include "Shape.h"
#include "Tetraed.h"
#include "Paralelepiped.h"
#include "Cube.h"

using namespace std;

int main(){
  cout<<"Єгоров Євгеній ІР21. Рівень А"<<endl<<"Короткі відомості про программу"<<endl;
  cout<<"Shape - абстрактний класс з двума віртуальними функціями get_v(знайти об'єм), get_s(знайти площу)."<<endl;
  cout<<"Класси Paralelepiped, Tetraed, Cube - наслідують класс Shape, перевизначаючи функції классу Shape."<<endl;
  int s,v;
  cout<<endl<<"Create Tetraed"<<endl;
  Tetraed * s1 = new Tetraed;
  cout<<endl<<"Tetraed s: "<<s1->get_s()<<" v: "<<s1->get_v()<<endl;
  
  cout<<endl<<"Create Cube"<<endl;
  Cube * s2 = new Cube;
  cout<<endl<<"Cube s: "<<s2->get_s()<<" v: "<<s2->get_v()<<endl;
  
  cout<<endl<<"Create Paralelepiped"<<endl;
  Paralelepiped * s3 = new Paralelepiped;
  cout<<endl<<"Paralelepiped s: "<<s3->get_s()<<" v: "<<s3->get_v()<<endl;
}

#include<iostream>
#include "Vector.h"

using namespace std;



int main(){
  cout<<"Єгоров Євгеній ІР21. Рівень А"<<endl<<endl<<"Короткі відомості про программу"<<endl;
  cout<<"Vector - має конструктор, що запитує х, у ветору. Оператори: +(сумма двух векторів), -(різниця), == (присвоїти значеняня, адже = не можна визначити)"<<endl;
  
  cout<<endl<<"Vector #1: "<<endl;
  Vector s1;
  cout<<"Vector #2: "<<endl;
  Vector s2;
  cout<<endl<<"Vector #1 data:"<<endl;
  s1.get_data();
  cout<<endl<<"Vector #1 data:"<<endl;
  s2.get_data();
  cout<<endl<<"Vector #1 + Vector #2 data:"<<endl;
  Vector s3 = s1 + s2;
  s3.get_data();
  cout<<endl<<"Vector #1 - Vector #2 data: "<<endl;
  Vector s4 = s1-s2;
  s4.get_data();
  cout<<endl<<"Vector #1 = Vector #2 data: "<<endl;
  Vector s5 = s1==s2;
  s5.get_data();
  return 0;
}

#include<iostream>
#include <math.h>
#include "circle.h"

using namespace std;


int main(){
  cout<<"Єгоров Євгеній ІР21. Рівень А"<<endl<<endl<<"Короткі відомості про программу"<<endl;
  cout<<"circle - має конструктор, що запитує х, у та радіус. А також конструк копіювання, який зменшує радіус в два рази"<<endl;
  cout<<"Далі программа створює масив, розмірності яку вкаже користувач та додає необхідну кількість кіл в цей масив"<<endl;

  
  cout<<endl<<"Create main circle:"<<endl;
  circle s1;
  cout<<endl<<"Main circle get data:"<<endl;
  s1.get_x();
  s1.get_y();
  s1.get_r();
  s1.get_length();
  cout<<endl<<"Circle copy:"<<endl;
  circle s2(s1);
  s2.get_x();
  s2.get_y();
  s2.get_r();
  s2.get_length();
  
  int k;
  cout<<endl<<"Input circle massive length: ";
  cin>>k;
  cout<<endl<<"Input circles data: "<<endl;
  circle *mas = new circle[k];

  for (int j = 0; j<k; j++) {
    cout<<endl<<j+1<<"/"<<k<<" circle length: "<<endl; 
    mas[j].get_x();
    mas[j].get_y();
    mas[j].get_r();
    mas[j].get_length();
  }
  return 0;
    
}

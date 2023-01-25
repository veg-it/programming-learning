#include <time.h>
#include <iostream>
#include <ctime>
#include "Date.h"

using namespace std;

int main ()
{
  cout<<"Єгоров Євгеній ІР21. Рівень Б"<<endl<<endl<<"Короткі відомості про программу"<<endl;
  cout<<"Date - має конструктор з трьома змінними, також два оператори +, та -, що додають та віднімають від однієї дати іншу. getData - Виводить дату до консолі (формат дд/мм/рррр), getUnix - переводить дату у UNIX формат за допомогою бібліотек сtime та time.h"<<endl;
  
  cout<<endl<<"Date #1: "<<endl;
  Date d1(20,12,2022);
  d1.getData();
  cout<<d1.getUnix()<<endl;
  cout<<endl<<"Date #2: "<<endl;
  Date d2(20,11,2018);
  d2.getData();
  cout<<d2.getUnix()<<endl;
  cout<<endl<<"Date #1 + Date 2: "<<endl;
  Date d3 = d1+d2;
  d3.getData();
  cout<<endl<<"Date #1 - Date 2: "<<endl;
  Date d4 = d1-d2;
  d4.getData();

}
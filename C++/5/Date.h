#include <time.h>
#include <iostream>
#include <ctime>

using namespace std;

class Date {
  private: 
    int d,m,y;
  public:
    Date(int dd, int mm, int yyyy){
      d = dd;
      m = mm;
      y = yyyy;
    }
    void getData(){
      cout<<d<<"/"<<m<<"/"<<y<<endl;
    }
    int getUnix(){
      time_t timer;
      struct tm date = {0};
      double seconds;
    
      date.tm_hour = 0;   
      date.tm_min = 0; 
      date.tm_sec = 0;
      date.tm_year = y - 1900; 
      date.tm_mon = m-1; 
      date.tm_mday = d;
  
      seconds = mktime(&date);
      return seconds;
    }
    friend Date operator+(const Date &date, const Date &sec_date);
    friend Date operator-(const Date &date, const Date &sec_date);
};
Date operator+(const Date &date, const Date &sec_date){
  int days[] ={31,28,31,30,31,30,31,31,30,31,30,31};
  int days_t[] ={31,29,31,30,31,30,31,31,30,31,30,31};
  int d,m,y;
  y = date.y+sec_date.y;
  if (y%4==0){
    if(date.m+sec_date.m > 12){
      m = date.m+sec_date.m -12;
      y = y+1;
      if (date.d+sec_date.d>days_t[m-1]){
        m=m+1;
        if(m>12){
          y=y+1;
        }
        d = date.d+sec_date.d-days_t[m-1];
      }
    } else{
      m = date.m+sec_date.m;
       if (date.d+sec_date.d>days[m-1]){
        m=m+1;
        if(m>12){
          y=y+1;
        }
        d = date.d+sec_date.d-days[m-1];
      }
    }
  }
  return Date(d,m,y);
};
Date operator-(const Date &date, const Date &sec_date){
  int days[] ={31,28,31,30,31,30,31,31,30,31,30,31};
  int days_t[] ={31,29,31,30,31,30,31,31,30,31,30,31};
  int d,m,y;
  y = date.y-sec_date.y;
  if (y%4==0){
    if(date.m-sec_date.m < 1){
      m = date.m+sec_date.m +12;
      y = y-1;
      if (date.d-sec_date.d<1){
        m=m-1;
        if(m<1){
          y=y-1;
          m=m+12;
        }
        d = date.d-sec_date.d+days[m-1];
      }
    } else{
      m = date.m-sec_date.m;
       if (date.d-sec_date.d<1){
        m=m-1;
        if(m<1){
          y=y-1;
          m=m+12;
        }
        d = date.d-sec_date.d+days[m-1];
      }
    }
  }
  return Date(d,m,y);
};
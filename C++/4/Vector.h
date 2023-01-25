#include<iostream>
using namespace std;

class Vector {          
  protected:
      int v[2];
  public:
      Vector() {
        cout<<"x: ";
        cin>>v[0];
        cout<<"y: ";
        cin>>v[1];
      }
      Vector(int x, int y){
        v[0] = x;
        v[1] = y;
      }
      friend Vector operator+(const Vector &vector, const Vector &sec_vector);
      friend Vector operator-(const Vector &vector, const Vector &sec_vector);
      friend Vector operator==(const Vector &vector, const Vector &sec_vector);
      void get_data(){
        cout<<"x: "<<v[0]<<" y: "<<v[1]<<endl;
      }
};
Vector operator+(const Vector &vector, const Vector &sec_vector){
  return Vector(vector.v[0]+sec_vector.v[0], vector.v[1]+sec_vector.v[1]);
};
Vector operator-(const Vector &vector, const Vector &sec_vector){
  return Vector(vector.v[0]-sec_vector.v[0], vector.v[1]-sec_vector.v[1]);
};
Vector operator==(const Vector &vector, const Vector &sec_vector){
  return Vector(sec_vector.v[0], sec_vector.v[1]);
};
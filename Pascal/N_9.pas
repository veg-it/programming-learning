    program n_9;
    var  
      P, d1, d2, d3, x1, x2, x3, y1, y2, y3, AB, BC, AC: real;
      function dlina(x1, y1, x2, y2: real): real;
       begin 
         d1:= sqrt(sqr(x2-x1)+sqr(y2-y1));
         end;
       begin 
         writeln('Введите координаты вершин треугольника');
         write('x1='); read(x1);
         write('y1='); read(y1);
         write('x2='); read(x2);
         write('y2='); read(y2);
         write('x3='); read(x3);
         write('y3='); read(y3);
         Writeln('Координаты: A[', x1, ';', y1, ']; B[', x2, ';', y2,']; C[', x3, ';', y3, '];');
         AB:= dlina(x1, y1, x2, y2);
         BC:= dlina(x2, y2, x3, y3);
         AC:= dlina(x1, y1, x3, y3);
         P:= AB+BC+AC;
         Writeln('Периметр равен ', P:0:2);
       end.
         
         
      
           
         
         
   
      
   
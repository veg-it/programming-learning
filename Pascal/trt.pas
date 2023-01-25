    program trt;
      var 
        x1, x2, x3, x4, y1, y2 ,y3, y4, S1, S2, S: real;
        function plosad(var x1, y1, x2, y2, x3 ,y3: real): real;
         begin 
           result:= abs((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3)) / 2;
         end;
         begin
           writeln('Введите координаты вершин четырехугольника');
           write('x1='); read(x1);
           write('y1='); read(y1);
           write('x2='); read(x2);
           write('y2='); read(y2);
           write('x3='); read(x3);
           write('y3='); read(y3);
           write('x4='); read(x4);
           write('y4='); read(y4);
           Writeln('Координаты: A[', x1, ';', y1, ']; B[', x2, ';', y2, ']; C[', x3, ';', y3, ']; D[', x4, ';', y4, '];');
           S1:= plosad(x1 , y1, x2, y2, x3, y3);
           S2:= plosad(x1, y1, x3, y3, x4, y4);
           S:=S1+S2;
           Writeln('Площадь равна ', S:0:2);
         end.
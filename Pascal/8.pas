uses crt;

const n=20;
var i,a,c,b,d:integer;
o:array[1..n] of integer;

begin
  clrscr;
  writeln('Введите оценки учеников: ');
  
  for i:=1 to n do begin
      readln(o[i]);
  end;

  a:=0;
  b:=0;
  c:=0;
  d:=0;
  for i:=1 to n do begin
      if (o[i]=5) then a:=a+1;
      if (o[i]=4) then b:=b+1;
      if (o[i]=3) then c:=c+1;
      if (o[i]=2) then d:=d+1;
  end;
  writeln('Оценку 5 получило: ',a, ' учеников');
  writeln('Оценку 4 получило: ',b, ' учеников');
  writeln('Оценку 3 получило: ',c, ' учеников');
  writeln('Оценку 2 получило: ',d, ' учеников');
  readkey;
end.
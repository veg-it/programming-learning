uses crt;

const y=10;
var i,j,c:integer;
var t:string;
var r:real;
n:array[1..y] of string;
k:array[1..y] of integer;
s:array[1..y] of integer;
p:array[1..y] of real;
begin
  clrscr;
  for i:=1 to y do begin
    write('Введите название страны ', i, ' : ');
    readln(n[i]);
    write('Введите численность населения ', i, ' : ');
    readln(k[i]);
    write('Введите площадь страны ', i, ' : ');
    readln(s[i]);
    p[i] := k[i]/s[i];
  end;

  for i := 1 to y-1 do
    for j := 1 to y-i do
        if p[j] > p[j+1] then begin
            r := p[j];
            p[j] := p[j+1];
            p[j+1] := r;
            c := k[j];
            k[j] := k[j+1];
            k[j+1] := c;
            t := n[j];
            n[j] := n[j+1];
            n[j+1] := t;
            c := s[j];
            s[j] := s[j+1];
            s[j+1] := c;
        end;
  writeln;
  writeln ('Отсортированный массив: ');
    for i := 1 to y do
        writeln(n[i], ' | ', k[i], ' | ', s[i], ' | ', p[i]);
  
  readkey;
end.
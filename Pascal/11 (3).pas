uses crt;

const y=10;
var i,j,c:integer;
var t:string;
n:array[1..y] of string;
k:array[1..y] of integer;
s:array[1..y] of integer;
begin
  clrscr;
  for i:=1 to y do begin
    write('Введите название страны ', i, ' : ');
    readln(n[i]);
    write('Введите численность населения ', i, ' : ');
    readln(k[i]);
    write('Введите площадь страны ', i, ' : ');
    readln(s[i]);
  end;

  for i := 1 to y-1 do
    for j := 1 to y-i do
        if k[j] > k[j+1] then begin
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
        writeln(n[i], ' | ', k[i], ' | ', s[i]);
  
  readkey;
end.
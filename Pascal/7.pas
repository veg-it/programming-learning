uses crt;

const n=10;
var i, m, s: integer;
a:array[1..n] of integer;
 
begin
  clrscr;
  s := 0;
  writeln('Введите елементы массива: ');
  readln(a[1]);
  m := a[1];
  for i := 2 to n do
  begin
    readln(a[i]);
    if a[i] > m then m := a[i];
  end;
  for i := 1 to n do 
  begin
    if a[i] = m then s := s + 1; end;
  writeln('Максимальный елемент = ', m);
  writeln('Количество максимальных елементов = ', s);
  readkey;
end.
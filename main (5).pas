Program task;
var sum: integer;
 
function f(last_num:integer ;num:integer; max:integer):integer;
begin
    if num = max then begin
        f:= max;
        exit;
    end;
    if num > max then begin
        f:= 0;
        exit;
    end;
    f:= num + f(num, last_num+num, max);
end;

begin
    writeln(1+f(1,1,9));
end.
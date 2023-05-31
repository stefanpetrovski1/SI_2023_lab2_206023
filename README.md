# SI_2023_lab2_206023
Stefan Petrovski 206023
<hr>

<h2> 2. Control flow graph </h2>


![image](https://github.com/stefanpetrovski1/SI_2023_lab2_206023/assets/114780490/1fc635be-d006-45ba-984f-4dda8c5d2493)




<h4> 3. Ciklomatska kompleksnost </h4>

Ciklomatskata kompleksnost isnesuva 11.
- spored predikatni jazli P+1 = 10+1 = 11
- spored ojlerova formula  e-v+2 =  31-22+2 = 11 regioni
- spored regioni (vklucuvajki go i nadvoresniot) 10+1 = 11


<h4> 5. Multiple condition metoda za 
if (user==null || user.getPassword()==null || user.getEmail()==null) </h4>

Odrediv 4 test primeri:

1. user==null, user.password==anything, user.email==anything // TXX
2. user!=null, user.password==null, user.email==anything     // FTX
3. user!=null, user.password!=null, user.email==null	     // FFT
4. user!=null, user.password!=null, user.email!=null	     // FFF

// Lazy evaluation gi eliminira nekoi test primeri, ex: (FTT == FTF) == T

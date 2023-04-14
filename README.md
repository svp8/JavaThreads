# JavaThreads
## 1 задание 
находится в папке src
## 2 задание 

#### 1)если мы хотим реализовать поиск за постоянное время, т.е. O(1)?
HashMap предлагает доступ к данным за O(1). так как не итерирет по каждым записям, а получает доступ по ключу.
Ключом будет Long(номер телефона), значением String(полное имя)

#### 2)если мы хотим занять как можно меньше памяти? 

#### Размер Long для номера:

12 байт Заголовок

8 байт  значение примитива

 Итого: 8+12 =20+4(для кратности 8)= 24 байта


#### Размер String для имени:

12 байт Заголовок

8 байта ссылка на byte[] value

4 байта int hash

1 байт byte coder

16 байт Заголовок byte[] (12 +4 байта на length)

2 байта на один символ (для 20-> 20*2=40)

Итого: 12+8+4+16+40+1=81 (округляем до 88)


#### Размер HashMap<Long,String>:

12 байт Заголовок

4 байта int threshold

4 байта float loadfactor

4 байта size

8 байт  ссылка transient Set<Map.Entry<K,V>> entrySet

8 байт ссылка на Node[] table

4 байта int modCount

Итого: 12+4+4+4+8+4+8=54 (округляем до 56)


#### Размер Node

12 байт Заголовок

8 байта ссылка на Long

8 байта ссылка на String

8 байта ссылка на следующий Node

4 байта int hash

Итого: 12+8+8+8+4=40 

**Расчет**

18 758 328 - количество записей

load factor=0.75

Начальный размер массива с корзинами 2^4, при достижении количества записей >0.75*2^(n), количество корзин увеличивается в 2 раза 

2^25*0,75=25 165 824

Количество узлов равно 2^25 = 33 554 432

Размер всех узлов=33 554 432*40 =1 342 177 280

Размер всех имен=18 758 328*88=1 650 732 864

Размер всех номеров=18 758 328*24=450 199 872


#### ОТВЕТ: 1 342 177 280 + 1 650 732 864 + 450 199 872+56=3 443 110 072 байт (3.2066 ГБ)
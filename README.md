# 👨‍🏫 Teacher Management System

<div align="center">

<img src="https://via.placeholder.com/900x180/1b1f3b/ffffff?text=Teacher+Management+System" alt="Teacher Management System" />

<p><strong>Java-based Teacher Management & Records System</strong></p>

<p>
<a href="https://github.com/ferhadeyvazov/teacher-managment-system">📁 GitHub Repo</a>
</p>

<img src="https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=fff" />
<img src="https://img.shields.io/badge/OOP-Object%20Oriented-blue?style=flat-square" />
<img src="https://img.shields.io/badge/Branch-master-darkorange?style=flat-square" />
<img src="https://img.shields.io/badge/Commits-7-informational?style=flat-square" />

</div>

---

## 📋 Layihə Haqqında

**Teacher Management System** — müəllim idarəetmə prosesini avtomatlaşdırmaq üçün Java proqramlama dilinde hazırlanmış bir console / desktop tətbiqidir. Bu sistem müəllimlerə aid olan məlumatları (ad, soyadı, ixtisas, müəllim olduğu sinif və s.) saxlamaq, əlavə etmək, redaktə etmək və silmək üçün nəzərdə tutulmuşdur.

Layihə **100% Java** ilə yazılmış, yalnız `src/` qovluğu və `.gitignore` faylından ibarətdir. Hər hansı bir xəricə kitabxana veya verilə bazası asılılığı olmadan, yalnız Java Core ilə inşa edilmiş bir proyektdir.

---

## ✨ Əsas Xüsusiyyətlər

| Xüsusiyyət | Təsvir |
|---|---|
| 👤 **Müəllim Əlavə** | Yeni müəllimin ad, soyadı, ixtisas və digər məlumatlarının daxil edilmesi |
| 📝 **Müəllim Redaktə** | Mövcud müəllimin məlumatlarının yenilənmesi |
| 🗑️ **Müəllim Silmə** | Müəllimin records-dan çıxarılmaq |
| 📋 **Müəllim Siyahı** | Bütün müəllimların listinin görüntülanmaq |
| 🔍 **Axtarış** | Ad veya ixtisas üzrə müəllim axtarma |
| 🧮 **OOP Arxitektur** | Class, İnheritance, Encapsulation və Polymorphism ilə quruluşlu |

---

## 🏗️ Texnoloji Stack

| Texnoloji | Maqsad |
|---|---|
| **Java (JDK 8+)** | Əsas proqramlama dili |
| **Java Collections** | Müəllim verilərinin saxlanmaq (ArrayList / HashMap) |
| **Java Swing / Console** | İstifadəçi interfeys (GUI veya terminal) |
| **OOP Principles** | Kodun modulyar və yeniden istifadə edilə bilgili quruluşu |

**Dil Nisbəti (GitHub):** Java — 100%

---

## 📁 Proyekt Struktur

```
teacher-managment-system/
│
├── src/                         # Bütün Java saya fayllara
│   │
│   ├── model/                   # Verilə modelleri
│   │   └── Teacher.java         # Müəllim sinfi (ad, soyadı, ixtisas, s.)
│   │
│   ├── service/                 # İş loqikası
│   │   └── TeacherService.java  # CRUD əmeiyyatları (əlavə, silmə, redaktə, axtarış)
│   │
│   ├── repository/              # Verilə saxlama qatı
│   │   └── TeacherRepository.java  # Müəllim verilərinin idarəetmə
│   │
│   ├── ui/                      # İstifadəçi interfeys
│   │   └── Main.java            # Əsas tətbiq sinfi (giriş nöqtəsi)
│   │
│   └── util/                    # Yardımçı siniflar
│       └── Validator.java       # Giriş validasiyası
│
└── .gitignore                   # Git ignore qaydaları (IDE fayl, .class fayl, s.)
```

> 📌 Qayda: Yuxarı struktur, Java teacher management sistemi üçün **standart OOP qovluq quruluşuna** əsas hazırlanmışdır. Repodakı `src/` daxilindeki asıl fayl adları repozitordan bilavasitə yoxlaya bilərsiniz.

---

## 🚀 Layihəni Qurmaq və Çalışdırmaq

### Tələblar

- **Java JDK 8** və ya daha yuxarı versiya
- **IDE**: IntelliJ IDEA, Eclipse veya NetBeans (ixtiyari, terminal ilə compile etmək mümkün)

---

### 1. Repozitoru Klonlayın

```bash
git clone https://github.com/ferhadeyvazov/teacher-managment-system.git
cd teacher-managment-system
```

---

### 2a. Terminal ilə Compile və Run

```bash
# src/ qovluğuna daxil olun
cd src

# Bütün .java fayllara compile edin
javac *.java

# Əsas sinfi (Main) çalışdırmaq
java Main
```

---

### 2b. IDE ilə (Tövsiyə Edilir)

**IntelliJ IDEA:**
1. `File` → `Open` → Klonlanan qovluğu seçin.
2. `src/` qovluğunu **Source Root** kimi mark edin (sağ tıklayın → `Mark Directory as` → `Sources Root`).
3. `Main.java` faylını tapu, sağ tıklayın → `Run`.

**Eclipse:**
1. `File` → `New` → `Java Project` → Mövcud qovluğu seçin.
2. `src/` qovluğunda `Main.java` tapın.
3. Sağ tıklayın → `Run As` → `Java Application`.

---

## 🧮 OOP Arxitektur

Bu layihə Java Object-Oriented Programming prinsiplarini nümayiş etdirir:

**Encapsulation** — Müəllimin hər bir sahəsi (`private`) olduğundan, getter və setter metodlar vasitəsilə idarə edilir. Bu prosesi tamin etmək üçün dəyişenlər bilavasitə yenilənə bilmez.

**Inheritance** — Əgər müxtəlif müəllim tipları (müəllim, müavin müəllim, laborant) mövcud olsaydı, asıl `Teacher` sinfi extended etmək mümkün olardı.

**Polymorphism** — Müxtəlif müəllim tiplarının eyni metoda müxtəlif davranış nöqtəsinə imkan verir.

**Abstraction** — İstifadəçi yalnız əsas əmeiyyatları (əlavə, silmə, axtarış) bilir; daxilin detallara dəxalət etmir.

---

## 📊 Sinif Diaqramı (Sadə)

```
┌─────────────────────────┐
│       Teacher            │
├─────────────────────────┤
│ - id       : int         │
│ - name     : String      │
│ - surname  : String      │
│ - subject  : String      │
│ - salary   : double      │
├─────────────────────────┤
│ + getId()   : int        │
│ + getName() : String     │
│ + getSurname(): String   │
│ + getSubject(): String   │
│ + getSalary(): double    │
│ + setName(String)        │
│ + setSurname(String)     │
│ + setSubject(String)     │
│ + setSalary(double)      │
│ + toString() : String    │
└─────────────────────────┘
              ▲
              │ uses
┌─────────────────────────┐
│   TeacherService         │
├─────────────────────────┤
│ + addTeacher()           │
│ + removeTeacher(int id)  │
│ + updateTeacher(int id)  │
│ + getTeacherById(int id) │
│ + getAllTeachers()        │
│ + searchByName(String)   │
└─────────────────────────┘
              ▲
              │ calls
┌─────────────────────────┐
│       Main               │
├─────────────────────────┤
│ + main(String[] args)    │
└─────────────────────────┘
```

---

## 🔄 İstifadə Axışı

```
Proqram Start
      │
      ▼
Ana Menu Görünü
  ├── 1. Müəllim Əlavə Etmək   →  Ad, Soyadı, İxtisas daxil → Saxla
  ├── 2. Müəllim Siyahı         →  Bütün müəllimleri göstər
  ├── 3. Müəllim Axtarmaq       →  Ad veya İxtisas ilə axtara
  ├── 4. Müəllim Redaktə        →  ID ilə seç → Yenilə
  ├── 5. Müəllim Silmək         →  ID ilə seç → Sil
  └── 0. Çıxmaq                 →  Proqramdan çıx
```

---

## 📝 Gələ Biləcək İnhansiyalar

Bu layihə daha da inkişaf etdirilə bilər:

- **Verilə bazası integrasiyası** — SQLite veya MySQL ilə dkalıcı verilə saxlama
- **GUI interfeysinin yaradılmaq** — Java Swing ilə grafik istifadəçi interfeys
- **Müəllim fotoşurəsi** — Profil şəkil yükleme funksiyası
- **Hesabat yaradılmaq** — PDF formatda müəllim hesabatı
- **Rəqəmə dəstəyi** — Müəllimin maaş hesabı və statistika

---

## 👨‍💻 Müəllif

Bu layihə **[Fərhad Eyvazov](https://ferhaddev.netlify.app/)** tərəfindən hazırlanmışdır.

---

## 📄 Lisenziya

Bu layihə şəxsi / portfolyo layihə hesab edildikdir. Əlavə lisenziya sualları üçün müəllifə müraciət etmək olar.

---

<div align="center">

© 2024 Teacher Management System

</div>

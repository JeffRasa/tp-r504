import fonctions as f

try:
    a = int(input('a:'))
    b = int(input('b:'))
    res = f.puissance(a, b)
    print(res)
except TypeError as e:
    print(f"Erreur : {e}")
except ValueError:
    print("Erreur : veuillez entrer des nombres entiers valides.")


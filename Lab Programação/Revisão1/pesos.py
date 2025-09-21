pesos = []

for c in range(10):
    peso = float(input(f"Digite o {c+1}° peso: "))
    pesos.append(peso)
    pesos.sort()

media = sum(pesos)/10

print(f"Média dos pesos: {media:.2f}")
print("Maior peso: " , max(pesos))
print("Menor peso: " , min(pesos))
print(pesos)
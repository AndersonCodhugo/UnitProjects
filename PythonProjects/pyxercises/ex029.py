v=float(input('Qual a sua velocidade? '))
if v <= 80:
    print('Sua velocidade de {}Km/h está dentro do permitido'.format(v))
else:
    print('Você foi multato em {:.2f} reais por ultrapassar {:.1f}Km/h do permitido'.format((v-80.0)*7.00,v-80.0))

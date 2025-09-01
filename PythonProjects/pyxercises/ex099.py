from time import sleep
def maior(*num):
        for n in range(0, len(num)):
                print(f'{num[n]} ' , end='', flush=True)
                sleep(0.5)
        print(f'Foram informados {len(num)} valores ao todo.')
        print(f'O maior valor informado foi {(max(num))}.')
        print('-=-'*15)
maior(2, 9, 4, 5, 7, 1)
maior(4, 7, 0)
maior(1, 2)
maior(6)
maior(0)

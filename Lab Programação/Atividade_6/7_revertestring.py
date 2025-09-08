def reverteString(palavra):
    if len(palavra) == 0:
        return ''
    return palavra[len(palavra) - 1] + reverteString(palavra[0:len(palavra) - 1])

print(reverteString('SOCORRAM ME SUBI NO ONIBUS EM MARROCOS'))
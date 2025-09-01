document.addEventListener('DOMContentLoaded', function() {
    const botaoCSS = document.getElementById('onOff');
    const styleSheet = document.getElementById('estiloPagina')

    botaoCSS.addEventListener('click', function() {
        if (styleSheet.disabled) {
            styleSheet.disabled = false;
            console.log('css ativado')
    } else {
        styleSheet.disabled = true;
        console.log('css desativado')
    }
    });
})

document.addEventListener ('DOMContentLoaded', function() {
    const enviarForms = document.getElementById('enviarForms')

    enviarForms.addEventListener('click', function() {
        alert('SEU FORMULÁRIO FOI ENVIADO COM SUCESSO!')
    });
});
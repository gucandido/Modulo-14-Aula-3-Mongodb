# Modulo 14 - Aula 3 - consultorio mongo db

### Endpoints para dentistas

#### 1. Cadastrar dentista
<p><code>Method: POST</code><br><code>Sign: http://localhost:8080/dentist</code></p>
<pre>
<code><span style="font-size: medium">Body:</span></code>

    {
        "idDentist":"DT0001",
        "name":"Francisco",
        "lastName":"Tiradentes",
        "specialty":"Tirar dentes"
    }

</pre>
<pre>
<code><span style="font-size: medium">Response (Status: 201 - Created):</span></code>

    {
        "idDentist":"DT0001",
        "name":"Francisco",
        "lastName":"Tiradentes",
        "specialty":"Tirar dentes"
    }

</pre>
<pre>
<table>
<tr><th colspan="3">Parâmetros</th></tr>
<tr style="text-align: left"><th>Parâmetro</th><th>Tipo</th><th>Descrição/Exemplo</th></tr>
<tr style="text-align: left"><td>idDentist</td><td>String</td><td>Identificador do dentista para uso do usuário</td></tr>
<tr style="text-align: left"><td>name</td><td>String</td><td>Nome</td></tr>
<tr style="text-align: left"><td>lastName</td><td>String</td><td>Sobrenome</td></tr>
<tr style="text-align: left"><td>specialty</td><td>String</td><td>Especialidade</td></tr>
</table>
</pre>

#### 2. Listar todos os dentistas

<p><code>Method: GET</code><br><code>Sign: http://localhost:8080/dentist</code></p>
<pre>
<code><span style="font-size: medium">Response (Status: 202 - Accepted):</span></code>

    [
        {
            "idDentist": "DT0001",
            "name": "Francisco",
            "lastName": "Tiradentes",
            "specialty": "Tirar dentes"
        }
    ]

</pre>
<pre>
<table>
<tr><th colspan="3">Parâmetros</th></tr>
<tr style="text-align: left"><th>Parâmetro</th><th>Tipo</th><th>Descrição/Exemplo</th></tr>
<tr style="text-align: left"><td>idDentist</td><td>String</td><td>Identificador do dentista para uso do usuário</td></tr>
<tr style="text-align: left"><td>name</td><td>String</td><td>Nome</td></tr>
<tr style="text-align: left"><td>lastName</td><td>String</td><td>Sobrenome</td></tr>
<tr style="text-align: left"><td>specialty</td><td>String</td><td>Especialidade</td></tr>
</table>
</pre>

#### 3. Apagar dentista

<p><code>Method: DELETE</code><br><code>Sign: http://localhost:8080/dentist</code></p>
<pre>
<code><span style="font-size: medium">Body:</span></code>

    {
        "id":"DT0001"
    }

</pre>
<pre>
<code><span style="font-size: medium">Response (Status: 201 - Created):</span></code>

    {
        "message": "Deletado com sucesso."
    }

</pre>

### Endpoints para pacientes

#### 1. Cadastrar paciente
<p><code>Method: POST</code><br><code>Sign: http://localhost:8080/patient</code></p>
<pre>
<code><span style="font-size: medium">Body:</span></code>

    {
        "idPatient":"PT0001",
        "name":"João",
        "lastName":"Ghordo",
        "age":45,
        "gender":"MALE"
    }

</pre>
<pre>
<code><span style="font-size: medium">Response (Status: 201 - Created):</span></code>

    {
        "idPatient":"PT0001",
        "name":"João",
        "lastName":"Ghordo",
        "age":45,
        "gender":"MALE"
    }

</pre>
<pre>
<table>
<tr><th colspan="3">Parâmetros</th></tr>
<tr style="text-align: left"><th>Parâmetro</th><th>Tipo</th><th>Descrição/Exemplo</th></tr>
<tr style="text-align: left"><td>idPatient</td><td>String</td><td>Identificador do paciente para uso do usuário</td></tr>
<tr style="text-align: left"><td>name</td><td>String</td><td>Nome</td></tr>
<tr style="text-align: left"><td>lastName</td><td>String</td><td>Sobrenome</td></tr>
<tr style="text-align: left"><td>age</td><td>int</td><td>Idade</td></tr>
<tr style="text-align: left"><td>gender</td><td>String</td><td>Gênero</td></tr>
</table>
</pre>

#### 2. Listar todos os pacientes

<p><code>Method: GET</code><br><code>Sign: http://localhost:8080/patient</code></p>
<pre>
<code><span style="font-size: medium">Response (Status: 202 - Accepted):</span></code>

    [
        {
            "idPatient": "PT0001",
            "name": "João",
            "lastName": "Ghordo",
            "age": 45,
            "gender": "MALE"
        }
    ]

</pre>
<pre>
<table>
<tr><th colspan="3">Parâmetros</th></tr>
<tr style="text-align: left"><th>Parâmetro</th><th>Tipo</th><th>Descrição/Exemplo</th></tr>
<tr style="text-align: left"><td>idPatient</td><td>String</td><td>Identificador do paciente para uso do usuário</td></tr>
<tr style="text-align: left"><td>name</td><td>String</td><td>Nome</td></tr>
<tr style="text-align: left"><td>lastName</td><td>String</td><td>Sobrenome</td></tr>
<tr style="text-align: left"><td>age</td><td>int</td><td>Idade</td></tr>
<tr style="text-align: left"><td>gender</td><td>String</td><td>Gênero</td></tr>
</table>
</pre>

#### 3. Apagar paciente

<p><code>Method: DELETE</code><br><code>Sign: http://localhost:8080/patient</code></p>
<pre>
<code><span style="font-size: medium">Body:</span></code>

    {
        "id":"PT0001"
    }

</pre>
<pre>
<code><span style="font-size: medium">Response (Status: 201 - Created):</span></code>

    {
        "message": "Deletado com sucesso."
    }

</pre>

### Endpoints para consultas

#### 1. Cadastrar consulta
<p><code>Method: POST</code><br><code>Sign: http://localhost:8080/turn</code></p>
<pre>
<code><span style="font-size: medium">Body:</span></code>

    {
        "idDentist":"DT0001",
        "idPatient":"PT0001",
        "day":"2021-08-28"
    }

</pre>
<pre>
<code><span style="font-size: medium">Response (Status: 201 - Created):</span></code>

    {
        "id": "61001ba0f872f808e1ec6fb0",
        "day": "2021-08-28",
        "dentist": {
            "id": "61001a167b922d59e65ed1e2",
            "idDentist": "DT0001",
            "name": "Francisco",
            "lastName": "Tiradentes",
            "specialty": "Tirar dentes"
        },
        "patient": {
            "idPatient": "PT0001",
            "name": "João",
            "lastName": "Ghordo",
            "age": 45,
            "gender": "MALE"
        },
        "status": "ATIVO"
    }

</pre>
<pre>
<table>
<tr><th colspan="3">Parâmetros</th></tr>
<tr style="text-align: left"><th>Parâmetro</th><th>Tipo</th><th>Descrição/Exemplo</th></tr>
<tr style="text-align: left"><td>id</td><td>String</td><td>Identificador único da consulta</td></tr>
<tr style="text-align: left"><td>day</td><td>String</td><td>Data da consulta</td></tr>
<tr style="text-align: left"><td>dentist</td><td>Object</td><td>Dentista da consulta</td></tr>
<tr style="text-align: left"><td>patient</td><td>Object</td><td>Paciente da consulta</td></tr>
<tr style="text-align: left"><td>status</td><td>String</td><td>Estado da consulta</td></tr>
</table>
</pre>

#### 2. Listar todas as consultas - Ex.1 Consultar todos os turnos.

<p><code>Method: GET</code><br><code>Sign: http://localhost:8080/turn</code></p>
<pre>
<code><span style="font-size: medium">Response (Status: 202 - Accepted):</span></code>

    [
        {
            "idTurn": "61001b78f872f808e1ec6faf",
            "day": "2021-07-28",
            "dentist": {
                "idDentist": "DT0001",
                "name": "Francisco",
                "lastName": "Tiradentes",
                "specialty": "Tirar dentes"
            },
            "patient": {
                "idPatient": "PT0001",
                "name": "João",
                "lastName": "Ghordo",
                "age": 45,
                "gender": "MALE"
            },
            "status": "ATIVO"
        },
        {
            "idTurn": "61001ba0f872f808e1ec6fb0",
            "day": "2021-08-28",
            "dentist": {
                "idDentist": "DT0001",
                "name": "Francisco",
                "lastName": "Tiradentes",
                "specialty": "Tirar dentes"
            },
            "patient": {
                "idPatient": "PT0001",
                "name": "João",
                "lastName": "Ghordo",
                "age": 45,
                "gender": "MALE"
            },
            "status": "ATIVO"
        }
    ]

</pre>
<pre>
<table>
<tr><th colspan="3">Parâmetros</th></tr>
<tr style="text-align: left"><th>Parâmetro</th><th>Tipo</th><th>Descrição/Exemplo</th></tr>
<tr style="text-align: left"><td>id</td><td>String</td><td>Identificador único da consulta</td></tr>
<tr style="text-align: left"><td>day</td><td>String</td><td>Data da consulta</td></tr>
<tr style="text-align: left"><td>dentist</td><td>Object</td><td>Dentista da consulta</td></tr>
<tr style="text-align: left"><td>patient</td><td>Object</td><td>Paciente da consulta</td></tr>
<tr style="text-align: left"><td>status</td><td>String</td><td>Estado da consulta</td></tr>
</table>
</pre>

#### 3. Apagar consulta

<p><code>Method: DELETE</code><br><code>Sign: http://localhost:8080/turn</code></p>
<pre>
<code><span style="font-size: medium">Body:</span></code>

    {
        "id":"61001b78f872f808e1ec6faf"
    }

</pre>
<pre>
<code><span style="font-size: medium">Response (Status: 201 - Created):</span></code>

    {
        "message": "Deletado com sucesso."
    }

</pre>

#### 4. Cancelar uma consulta

<p><code>Method: POST</code><br><code>Sign: http://localhost:8080/turn/cancel</code></p>
<pre>
<code><span style="font-size: medium">Body:</span></code>

    {
        "id":"61001ba0f872f808e1ec6fb0"
    }

</pre>
<pre>
<code><span style="font-size: medium">Response (Status: 201 - Created):</span></code>

    {
        "id": "61001ba0f872f808e1ec6fb0",
        "day": "2021-08-28",
        "dentist": {
                "id": "61001a167b922d59e65ed1e2",
                "idDentist": "DT0001",
                "name": "Francisco",
                "lastName": "Tiradentes",
                "specialty": "Tirar dentes"
            },
        "patient": {
                "idPatient": "PT0001",
                "name": "João",
                "lastName": "Ghordo",
                "age": 45,
                "gender": "MALE"
            },
        "status": "CANCELADO"
    }

</pre>
<pre>
<table>
<tr><th colspan="3">Parâmetros</th></tr>
<tr style="text-align: left"><th>Parâmetro</th><th>Tipo</th><th>Descrição/Exemplo</th></tr>
<tr style="text-align: left"><td>id</td><td>String</td><td>Identificador único da consulta</td></tr>
<tr style="text-align: left"><td>day</td><td>String</td><td>Data da consulta</td></tr>
<tr style="text-align: left"><td>dentist</td><td>Object</td><td>Dentista da consulta</td></tr>
<tr style="text-align: left"><td>patient</td><td>Object</td><td>Paciente da consulta</td></tr>
<tr style="text-align: left"><td>status</td><td>String</td><td>Estado da consulta</td></tr>
</table>
</pre>

#### 5. Listar todas as consultas de um dentista - Ex. 2 Consultar as consultas com o dentista. 

<p><code>Method: GET</code><br><code>Sign: http://localhost:8080/turn/dentist?idDentist={idDentist}</code></p>
<pre>
<code><span style="font-size: medium">Response (Status: 202 - Accepted):</span></code>

    [
        {
            "idTurn": "61001b78f872f808e1ec6faf",
            "day": "2021-07-28",
            "dentist": {
                "idDentist": "DT0001",
                "name": "Francisco",
                "lastName": "Tiradentes",
                "specialty": "Tirar dentes"
            },
            "patient": {
                "idPatient": "PT0001",
                "name": "João",
                "lastName": "Ghordo",
                "age": 45,
                "gender": "MALE"
            },
            "status": "ATIVO"
        },
        {
            "idTurn": "61001ba0f872f808e1ec6fb0",
            "day": "2021-08-28",
            "dentist": {
                "idDentist": "DT0001",
                "name": "Francisco",
                "lastName": "Tiradentes",
                "specialty": "Tirar dentes"
            },
            "patient": {
                "idPatient": "PT0001",
                "name": "João",
                "lastName": "Ghordo",
                "age": 45,
                "gender": "MALE"
            },
            "status": "CANCELADO"
        }
    ]

</pre>
<pre>
<table>
<tr><th colspan="3">Parâmetros</th></tr>
<tr style="text-align: left"><th>Parâmetro</th><th>Tipo</th><th>Descrição/Exemplo</th></tr>
<tr style="text-align: left"><td>idDentist</td><td>String</td><td>Identificador do dentista para uso do usuário (no exemplo acima foi utilizado a chave "DT0001")</td></tr>
<tr style="text-align: left"><td>id</td><td>String</td><td>Identificador único da consulta</td></tr>
<tr style="text-align: left"><td>day</td><td>String</td><td>Data da consulta</td></tr>
<tr style="text-align: left"><td>dentist</td><td>Object</td><td>Dentista da consulta</td></tr>
<tr style="text-align: left"><td>patient</td><td>Object</td><td>Paciente da consulta</td></tr>
<tr style="text-align: left"><td>status</td><td>String</td><td>Estado da consulta</td></tr>
</table>
</pre>

#### 6. Listar todas as consultas pelo estado - Ex. 3 Consultar os turnos por estado

<p><code>Method: GET</code><br><code>Sign: http://localhost:8080/turn/status?status={status}</code></p>
<pre>
<code><span style="font-size: medium">Response (Status: 202 - Accepted):</span></code>

    [
        {
            "idTurn": "61001ba0f872f808e1ec6fb0",
            "day": "2021-08-28",
            "dentist": {
                "idDentist": "DT0001",
                "name": "Francisco",
                "lastName": "Tiradentes",
                "specialty": "Tirar dentes"
            },
            "patient": {
                "idPatient": "PT0001",
                "name": "João",
                "lastName": "Ghordo",
                "age": 45,
                "gender": "MALE"
            },
            "status": "CANCELADO"
        }
    ]

</pre>
<pre>
<table>
<tr><th colspan="3">Parâmetros</th></tr>
<tr style="text-align: left"><th>Parâmetro</th><th>Tipo</th><th>Descrição/Exemplo</th></tr>
<tr style="text-align: left"><td>status</td><td>String</td><td>Identificador de estado da consulta (no exemplo acima foi utilizado o estado "CANCELADO")</td></tr>
<tr style="text-align: left"><td>id</td><td>String</td><td>Identificador único da consulta</td></tr>
<tr style="text-align: left"><td>day</td><td>String</td><td>Data da consulta</td></tr>
<tr style="text-align: left"><td>dentist</td><td>Object</td><td>Dentista da consulta</td></tr>
<tr style="text-align: left"><td>patient</td><td>Object</td><td>Paciente da consulta</td></tr>
<tr style="text-align: left"><td>status</td><td>String</td><td>Estado da consulta</td></tr>
</table>
</pre>

import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AgendamentoServiceService {



private host = "http://localhost:8080/apiAgendamento";
  http: any;



public postAgendamento(obj: any) {
  return new Promise((ret) => {
    let headers = new HttpHeaders();
    headers.append('Content-Type', 'application/json; charset=UTF-8');

    this.http
      .post(this.host, obj, { headers: headers })
      .subscribe((Agendamento: any) => {
        ret(Agendamento);
      });
  });
}

public getAllAgendamento() {
  return new Promise((resolve) => {
    this.http.get(this.host).subscribe((response: any) => {
      const Agendamento = response.content;
      resolve(Agendamento);
    });
  });
}

public getAgendamentoById(id: number) {
  return new Promise((ret) => {
    this.http.get(this.host + '{' + id + '}').subscribe((Agendamento: any) => {
      ret(Agendamento);
    });
  });
}

public deleteCliente(id: number) {
  return new Promise<void>((resolve) => {
    this.http.delete(this.host + '/' + id).subscribe((Agendamento: any) => {
      resolve();
    });
  });
}
}

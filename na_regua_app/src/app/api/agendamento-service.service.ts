import { Injectable } from '@angular/core';
import { HttpHeaders,HttpClient  } from '@angular/common/http';

 

@Injectable({
  providedIn: 'root'
})
export class AgendamentoServiceService {


 
constructor(private http: HttpClient) {}


private host = "http://localhost:8080/apiAgendamento";


public postAgendamento(obj: any) {
  return new Promise((ret) => {
    let headers = new HttpHeaders();
    headers.append('Content-Type', 'application/json; charset=UTF-8');

    this.http
      .post(this.host, obj, { headers: headers })
      .subscribe((Agendamento) => {
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
    this.http.get(this.host + '{' + id + '}').subscribe((Agendamento) => {
      ret(Agendamento);
    });
  });
}

public deleteAgendamento(id: number) {
  return new Promise<void>((resolve) => {
    this.http.delete(this.host + '/' + id).subscribe((dados) => {
      resolve();
    });
  });
}
}

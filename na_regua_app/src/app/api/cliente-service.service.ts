import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
 

  export class ClienteServiceService {
    postAgendamento(Agendamento: any) {
      throw new Error('Method not implemented.');
    }
    constructor(private http: HttpClient) {}
  
    private host = 'http://localhost:8080/apiClientes';
  
    public postCliente(obj: any) {
      return new Promise((ret) => {
        let headers = new HttpHeaders();
        headers.append('Content-Type', 'application/json; charset=UTF-8');
  
        this.http
          .post(this.host, obj, { headers: headers })
          .subscribe((Cliente) => {
            ret(Cliente);
          });
      });
    }
  
    public getAllCliente() {
      return new Promise((resolve) => {
        this.http.get(this.host).subscribe((response: any) => {
          const Cliente = response.content;
          resolve(Cliente);
        });
      });
    }
  
    public getClienteById(id: number) {
      return new Promise((ret) => {
        this.http.get(this.host + '{' + id + '}').subscribe((cliente) => {
          ret(cliente);
        });
      });
    }
  
    public deleteCliente(id: number) {
      return new Promise<void>((resolve) => {
        this.http.delete(this.host + '/' + id).subscribe((dados) => {
          resolve();
        });
      });
    }
}

import { Component } from '@angular/core';
import { Http }      from '@angular/http';

@Component({
    moduleId: module.id,
    selector: 'app',
    templateUrl: './app.component.html'    
})
export class AppComponent {    
    fotos: Object[];
    constructor (http: Http) {

        http
        .get("/projetoAngularSpring/foto")
        .map(res => res.json())
        .subscribe(f => {
            this.fotos = f;
            console.log(this.fotos);            
        }, erro => console.log(erro));

    }

}
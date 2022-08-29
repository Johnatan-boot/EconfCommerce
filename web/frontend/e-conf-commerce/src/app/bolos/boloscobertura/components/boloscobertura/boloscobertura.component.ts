import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-boloscobertura',
  templateUrl: './boloscobertura.component.html',
  styleUrls: ['./boloscobertura.component.scss']
})
export class BoloscoberturaComponent implements OnInit {

  imgUrlBannerBoloCob: string = './assets/bannercadastro/bannerCadastro.png';

  constructor() { }

  ngOnInit(): void {
  }

}

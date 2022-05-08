import {Component, OnInit} from '@angular/core';
import {TypeExpertiseService} from '../../../../../controller/service/TypeExpertise.service';
import {TypeExpertiseVo} from '../../../../../controller/model/TypeExpertise.model';
import {RoleService} from '../../../../../controller/service/role.service';
import {MessageService} from 'primeng/api';
import {Router} from '@angular/router';
import {MenuItem} from 'primeng/api';
import { environment } from 'src/environments/environment';
import {DateUtils} from '../../../../../utils/DateUtils';
import {DatePipe} from '@angular/common';


@Component({
  selector: 'app-type-expertise-edit-admin',
  templateUrl: './type-expertise-edit-admin.component.html',
  styleUrls: ['./type-expertise-edit-admin.component.css']
})
export class TypeExpertiseEditAdminComponent implements OnInit {


constructor(private datePipe: DatePipe, private typeExpertiseService: TypeExpertiseService
 ,       private roleService:RoleService
 ,       private messageService: MessageService
 ,       private router: Router
) {
}

// methods
ngOnInit(): void {
}

public edit(){
this.editWithShowOption(false);
}
public editWithShowOption(showList: boolean){
            this.selectedTypeExpertise.dateArchivage = DateUtils.toDate(this.selectedTypeExpertise.dateArchivage);
            this.selectedTypeExpertise.dateCreation = DateUtils.toDate(this.selectedTypeExpertise.dateCreation);
    this.typeExpertiseService.edit().subscribe(typeExpertise=>{
    const myIndex = this.typeExpertises.findIndex(e => e.id === this.selectedTypeExpertise.id);
    this.typeExpertises[myIndex] = this.selectedTypeExpertise;
    this.editTypeExpertiseDialog = false;
    this.selectedTypeExpertise = new TypeExpertiseVo();


    }, error => {
        console.log(error);
    });

}

// methods

hideEditDialog(){
    this.editTypeExpertiseDialog  = false;
}

// getters and setters

get typeExpertises(): Array<TypeExpertiseVo> {
    return this.typeExpertiseService.typeExpertises;
       }
set typeExpertises(value: Array<TypeExpertiseVo>) {
        this.typeExpertiseService.typeExpertises = value;
       }

 get selectedTypeExpertise(): TypeExpertiseVo {
           return this.typeExpertiseService.selectedTypeExpertise;
       }
    set selectedTypeExpertise(value: TypeExpertiseVo) {
        this.typeExpertiseService.selectedTypeExpertise = value;
       }

   get editTypeExpertiseDialog(): boolean {
           return this.typeExpertiseService.editTypeExpertiseDialog;

       }
    set editTypeExpertiseDialog(value: boolean) {
        this.typeExpertiseService.editTypeExpertiseDialog = value;
       }


    get dateFormat(){
            return environment.dateFormatEdit;
    }

    get dateFormatColumn(){
            return environment.dateFormatList;
     }
}
